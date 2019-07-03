
function io() {
    var ss=Arguments[0];
    this.ooo=Arguments[1];

    this.getName=function () {
        return ss;
    }
    this.getAge=function () {
        return this.ooo;
    }
}

var io=new io("wang");
console.log(io.getAge());

