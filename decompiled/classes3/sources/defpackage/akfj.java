package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class akfj {
    static final aigf a;
    static final aigf b;
    static final aigf c;
    static final java.lang.String d;
    static final java.util.regex.Pattern e;
    static final java.util.regex.Pattern f;
    static final java.lang.String g;
    static final java.lang.String h;
    static final java.lang.String i;
    static final java.lang.String j;
    static final java.util.regex.Pattern k;

    static {
        aigb aigbVar = new aigb(4);
        aigbVar.i('0', '0');
        aigbVar.i('1', '1');
        aigbVar.i('2', '2');
        aigbVar.i('3', '3');
        aigbVar.i('4', '4');
        aigbVar.i('5', '5');
        aigbVar.i('6', '6');
        aigbVar.i('7', '7');
        aigbVar.i('8', '8');
        aigbVar.i('9', '9');
        aigf aigfVarE = aigbVar.e(true);
        a = aigfVarE;
        aigb aigbVar2 = new aigb(4);
        aigbVar2.i('A', '2');
        aigbVar2.i('B', '2');
        aigbVar2.i('C', '2');
        aigbVar2.i('D', '3');
        aigbVar2.i('E', '3');
        aigbVar2.i('F', '3');
        aigbVar2.i('G', '4');
        aigbVar2.i('H', '4');
        aigbVar2.i('I', '4');
        aigbVar2.i('J', '5');
        aigbVar2.i('K', '5');
        aigbVar2.i('L', '5');
        aigbVar2.i('M', '6');
        aigbVar2.i('N', '6');
        aigbVar2.i('O', '6');
        aigbVar2.i('P', '7');
        aigbVar2.i('Q', '7');
        aigbVar2.i('R', '7');
        aigbVar2.i('S', '7');
        aigbVar2.i('T', '8');
        aigbVar2.i('U', '8');
        aigbVar2.i('V', '8');
        aigbVar2.i('W', '9');
        aigbVar2.i('X', '9');
        aigbVar2.i('Y', '9');
        aigbVar2.i('Z', '9');
        aigf aigfVarE2 = aigbVar2.e(true);
        b = aigfVarE2;
        aigb aigbVar3 = new aigb(4);
        aigbVar3.l(aigfVarE2);
        aigbVar3.l(aigfVarE);
        c = aigbVar3.e(true);
        java.lang.String strConcat = java.lang.String.valueOf(aigfVarE2.f().toString().replaceAll("[, \\[\\]]", "")).concat(java.lang.String.valueOf(ahvr.p(aigfVarE2.f().toString()).replaceAll("[, \\[\\]]", "")));
        d = strConcat;
        e = java.util.regex.Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        f = java.util.regex.Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        java.lang.String strConcat2 = java.lang.String.valueOf(strConcat).concat("\\p{Nd}");
        g = strConcat2;
        java.lang.String str = "[" + strConcat2 + "]+((\\-)*[" + strConcat2 + "])*";
        h = str;
        java.lang.String str2 = "[" + strConcat + "]+((\\-)*[" + strConcat2 + "])*";
        i = str2;
        java.lang.String str3 = "^(" + str + "\\.)*" + str2 + "\\.?$";
        j = str3;
        k = java.util.regex.Pattern.compile(str3);
    }
}
