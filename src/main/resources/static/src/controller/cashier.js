layui.define(['table','form'],function(exports){
    var $ = layui.$
        ,view = layui.view
        ,admin = layui.admin
        ,table = layui.table
        ,form = layui.form;

    table.render({
        elem: '#test'
        ,url:'/test/table/demo1.json'
        ,toolbar: '#toolbarDemo'
        ,title: '收银员数据表'
        ,cols: [[
            {type: 'checkbox', fixed: 'left'}
            ,{field:'id', title:'ID', width:80, fixed: 'left', unresize: true, sort: true}
            ,{field:'username', title:'用户名', width:120, edit: 'text'}
            ,{field:'email', title:'邮箱', width:150, edit: 'text', templet: function(res){
                    return '<em>'+ res.email +'</em>'
                }}
            ,{field:'sex', title:'性别', width:80, edit: 'text', sort: true}
            ,{field:'city', title:'城市', width:100}
            ,{field:'sign', title:'签名'}
            ,{field:'experience', title:'积分', width:80, sort: true}
            ,{field:'ip', title:'IP', width:120}
            ,{field:'logins', title:'登入次数', width:100, sort: true}
            ,{field:'joinTime', title:'加入时间', width:120}
            ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:150}
        ]]
        ,page: true
    });

    //头工具栏事件
    table.on('toolbar(test)', function(obj){
        var checkStatus = table.checkStatus(obj.config.id);
        switch(obj.event){
            case 'getCheckData':
                var data = checkStatus.data;
                layer.alert(JSON.stringify(data));
                break;
            case 'getCheckLength':
                var data = checkStatus.data;
                layer.msg('选中了：'+ data.length + ' 个');
                break;
            case 'isAll':
                layer.msg(checkStatus.isAll ? '全选': '未全选');
                break;
        };
    });

    //监听行工具事件
    table.on('tool(test)', function(obj){
        var data = obj.data;
        //console.log(obj)
        if(obj.event === 'del'){
            layer.confirm('真的删除行么', function(index){
                obj.del();
                layer.close(index);
            });
        } else if(obj.event === 'edit'){
            layer.prompt({
                formType: 2
                ,value: data.email
            }, function(value, index){
                obj.update({
                    email: value
                });
                layer.close(index);
            });
        }
    });

    exports('cashier', {})
});