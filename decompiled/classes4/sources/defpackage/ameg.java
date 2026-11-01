package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ameg implements defpackage.amdf {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/TimingPuncParserDecorator");
    private final defpackage.amdf b;

    public ameg(defpackage.amdf amdfVar) {
        this.b = amdfVar;
    }

    @Override // defpackage.amdf
    public final aify a(defpackage.amcp amcpVar, defpackage.altp altpVar, int i) {
        int i2;
        java.lang.String str;
        alto altoVar = new alto();
        int i3 = 0;
        altoVar.c(0);
        java.lang.String str2 = amcpVar.b;
        altoVar.b(str2.length());
        defpackage.altp altpVarA = altoVar.a();
        java.lang.String strTrim = altpVarA.h(str2).trim();
        java.lang.String strTrim2 = str2.substring(0, altpVarA.a).trim();
        j$.util.stream.Stream streamLimit = j$.util.Collection.-EL.stream(amcpVar.c).skip(strTrim2.trim().isEmpty() ? 0 : strTrim2.split(" ").length).limit(strTrim.trim().isEmpty() ? 0 : strTrim.split(" ").length);
        j$.util.stream.Collector collector = aido.a;
        java.util.List list = (aify) streamLimit.collect(collector);
        aike aikeVarO = aify.o(strTrim.split(" "));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i4 = 1;
        int i5 = 0;
        boolean zEquals = true;
        while (i5 < aikeVarO.d) {
            if (((java.lang.String) aikeVarO.get(i5)).trim().isEmpty()) {
                i2 = i3;
            } else {
                java.lang.String string = (java.lang.String) aikeVarO.get(i5);
                if (zEquals && !string.isEmpty()) {
                    string = new java.lang.StringBuilder(string).replace(i3, i4, ahvr.q(string.substring(i3, i4))).toString();
                }
                sb.append(string);
                if (java.util.regex.Pattern.matches("(.*?)[,.]$", string)) {
                    i2 = i3;
                } else {
                    defpackage.amen amenVar = amcpVar.f;
                    i2 = i3;
                    int iIntValue = ((java.lang.Integer) ahvr.bi(list, i5, java.lang.Integer.valueOf(i2))).intValue();
                    if (iIntValue == -1 || iIntValue >= amenVar.f) {
                        str = ". ";
                    } else if (iIntValue >= amenVar.e) {
                        str = ", ";
                    }
                    sb.append(str);
                    zEquals = str.equals(". ");
                }
                str = " ";
                sb.append(str);
                zEquals = str.equals(". ");
            }
            i5++;
            i3 = i2;
            i4 = 1;
        }
        java.lang.String strTrim3 = sb.toString().trim();
        aify aifyVarB = defpackage.amev.b(strTrim, strTrim3);
        aigf aigfVarC = defpackage.amev.c((aigf) j$.util.Collection.-EL.stream(amcpVar.d.e()).collect(aido.b(new defpackage.alzr(18), new defpackage.allm(altpVarA, aifyVarB, 5, null))));
        j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(amcpVar.e);
        j$.util.Objects.requireNonNull(altpVarA);
        java.lang.Iterable iterable = (aify) stream.filter(new defpackage.amcc(altpVarA, 7)).map(new defpackage.alyy(altpVarA, 17)).map(new defpackage.alyy(altpVarA, 18)).map(new defpackage.alyy(aifyVarB, 19)).map(new defpackage.alyy(strTrim3, 20)).collect(collector);
        defpackage.amcn amcnVar = new defpackage.amcn(amcpVar);
        amcnVar.e(strTrim3);
        amcnVar.f(aigfVarC);
        amcnVar.d(iterable);
        amcnVar.g(list);
        defpackage.amcp amcpVarA = amcnVar.a();
        java.lang.String str3 = amcpVarA.b;
        int i6 = altpVar.a;
        aify aifyVarB2 = defpackage.amev.b(str2, str3);
        int iIntValue2 = i6 + ((java.lang.Integer) aifyVarB2.get(i6)).intValue();
        int i7 = altpVar.b;
        defpackage.altp altpVarB = defpackage.altp.b(iIntValue2, i7 + ((java.lang.Integer) aifyVarB2.get(i7 - 1)).intValue());
        int i8 = altpVarB.b;
        if (i8 < str3.length() && str3.charAt(i8) == '.') {
            altpVarB = altpVarB.c(1);
        }
        return (aify) j$.util.Collection.-EL.stream(this.b.a(amcpVarA, altpVarB, i)).map(new defpackage.syi(amcpVar, amcpVarA, i, 2)).collect(collector);
    }

    @Override // defpackage.amdf
    public final ajcq b(defpackage.alqk alqkVar) {
        return this.b.b(alqkVar);
    }
}
