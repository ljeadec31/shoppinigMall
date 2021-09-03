var main = {
    init : function () {
        console.log("hi i am here");
        var _this = this;
        $('#btn-join').on('click',function () {
            _this.join();
        });
    },
    join : function () {
        console.log('got it');
        var data = {
            id: $("id").val(),
            pw: $("pw").val(),
            name: $("user_input").val(),
            email: $("email").val(),
            addr: $("addr").val()
        };

        $.ajax({
            type: 'POST',
            url: '/api/v1/members',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function(){
            alert("가입이 완료되었습니다.");
            window.location.href='/';
        }).fail(function(error){
            alert(JSON.stringify(error));
        });
    }
};

main.init();