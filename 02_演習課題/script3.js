//問1//
document.write("問1");
document.write("<br>");
document.write("<br>");

function area(radius){
    return radius * radius * 3.14;
}

//半径5㎝の円//
document.write("①：半径5cmの円の場合　→　" );
document.write("答え：" + area(5) + "cm² <br>");
//半径7cmの円//
document.write("②：半径7cmの円の場合　→　" );
document.write("答え：" + area(7) + "cm² <br>");
//半径10cmの円//
document.write("③：半径10cmの円の場合　→　" );
document.write("答え：" + area(10) + "cm² <br>");
document.write("<br>");
document.write("<br>");
document.write("<br>");
document.write("<br>");

//問2//
document.write("問2");
document.write("<br>");
document.write("<br>");

function totalPrice(adult, child){
    return (adult * 500) + (child * 200);
}

//A//
document.write("①：Aグループの合計金額　→　" );
document.write( totalPrice(2, 4) + "円です。 <br>");
//B//
document.write("②：Bグループの合計金額　→　" );
document.write( totalPrice(1, 5) + "円です。 <br>");
//C//
document.write("③：Cグループの合計金額　→　" );
document.write( totalPrice(3, 7) + "円 です<br>");

