package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amdu implements defpackage.amdf {
    public static final /* synthetic */ int a = 0;
    private static final aify b;
    private static final java.lang.String c;
    private static final aigf d;
    private static final java.lang.String e;
    private static final java.lang.String f;
    private static final java.lang.String g;
    private static final aify h;
    private static final java.lang.String i;
    private static final java.util.regex.Pattern j;
    private static final java.util.regex.Pattern k;
    private static final java.util.regex.Pattern l;

    static {
        aify aifyVarX = aify.x(j$.util.Comparator.-EL.reversed(j$.util.Comparator.-CC.comparingInt(new defpackage.amdt(0))), aify.w("for", "to", "if you want to", "if", "4", "2", "if you want 2", "four", "two", "if you want two", "alternatively", "otherwise", new java.lang.String[0]));
        b = aifyVarX;
        java.lang.String strY = anty.y(aifyVarX);
        c = strY;
        aigb aigbVar = new aigb(4);
        aigbVar.i("zero", "0");
        aigbVar.i("one", "1");
        aigbVar.i("two", "2");
        aigbVar.i("three", "3");
        aigbVar.i("four", "4");
        aigbVar.i("five", "5");
        aigbVar.i("six", "6");
        aigbVar.i("seven", "7");
        aigbVar.i("eight", "8");
        aigbVar.i("nine", "9");
        aigbVar.i("pound", "#");
        aigbVar.i("star", "*");
        aigbVar.i("the pound key", "#");
        aigbVar.i("the star key", "*");
        aigf aigfVarE = aigbVar.e(true);
        d = aigfVarE;
        java.lang.String str = (java.lang.String) j$.util.stream.Stream.-CC.concat(j$.util.Collection.-EL.stream(aigfVarE.f()), j$.util.Collection.-EL.stream(aigfVarE.c()).map(new defpackage.amdk(10))).collect(j$.util.stream.Collectors.joining("|"));
        e = str;
        java.lang.String str2 = java.text.MessageFormat.format("(?:(?:^(?:({0})[,.]?)(?:\\s|$))|(?:(?<!(?<!^) or) (?:({0})[,.]?)(?:\\s|$)))", strY);
        f = str2;
        java.lang.String str3 = java.text.MessageFormat.format("(?:please )?(?<!hang up and )(?:(?:say|stay|see) (?:.'{1,30}' )?(?:or|for) )?(?:press|dial)(?: (?:or|for) (?:say|stay|see))?(?: ((?:{0})+))", str);
        g = str3;
        aify aifyVarX2 = aify.x(j$.util.Comparator.-EL.reversed(j$.util.Comparator.-CC.comparingInt(new defpackage.amdt(0))), aify.w(str3, "thank you for calling", "thank you", "welcome to", "serve you", "hold time", "please hold for", "please hold", "continue to hold", "hold on", "(?:remain|stay) on the line", "your patience", new java.lang.String[]{"dot-com", "www", "w w w", "org", "our app", "mobile app", "(?:visit|available on|found on|through|check) our website", "our website (?:is|does)", "this page", "your call", "important to us", "monitored", "recorded", "quality assurance", "quality service", "training purposes", "can (?:i|we) help", "how (?:i|we) may help", "we're here for you", "following options", "dial it", "area code", "to better assist you", "to provide you", "you to the right", "which would you like", "which of these", "select one of", "you can(?: also)? say", "i(?: still)? didn't hear you", "what was that", "hang up", "to get started", "thank you for visiting", "(?:enter|say|what is) (?:the|your|a) .{0,30} (?:number|code|ID|I D)", "espanol", "reaching this message", "we are experiencing", "did you know", "rates may apply"}));
        h = aifyVarX2;
        java.lang.String str4 = java.text.MessageFormat.format("(?:(?:{0})(?:\\s|$))", j$.util.Collection.-EL.stream(aifyVarX2).map(new defpackage.amdk(11)).collect(j$.util.stream.Collectors.joining("|")));
        i = str4;
        j = java.util.regex.Pattern.compile(str3, 2);
        k = java.util.regex.Pattern.compile(str4, 2);
        l = java.util.regex.Pattern.compile(java.text.MessageFormat.format("({0}.*)$", str2), 2);
    }

    public static final j$.util.Optional c(java.lang.String str, defpackage.altp altpVar) {
        java.util.regex.Matcher matcher = j.matcher(altpVar.h(str));
        if (!matcher.find()) {
            return j$.util.Optional.empty();
        }
        int i2 = altpVar.a;
        defpackage.altp altpVarB = defpackage.altp.b(matcher.start() + i2, i2 + matcher.end());
        java.lang.String strGroup = matcher.group(1);
        return j$.util.Optional.of(new defpackage.amet((java.lang.String) d.getOrDefault(strGroup, strGroup), altpVarB));
    }

    private static final j$.util.Optional d(defpackage.amcp amcpVar, defpackage.altp altpVar, int i2) {
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        java.lang.String str = amcpVar.b;
        j$.util.Optional optionalC = c(str, altpVar);
        while (optionalC.isPresent() && optionalEmpty.isEmpty()) {
            alto altoVar = new alto();
            altoVar.c(java.lang.Math.max(altpVar.a, ((defpackage.amet) optionalC.get()).b.b - 150));
            altoVar.b(((defpackage.amet) optionalC.get()).b.a);
            defpackage.altp altpVarA = altoVar.a();
            java.util.regex.Pattern pattern = k;
            java.util.regex.Matcher matcher = pattern.matcher(altpVarA.h(str));
            while (matcher.find()) {
                altpVarA = altpVarA.d(matcher.end());
                matcher = pattern.matcher(altpVarA.h(str));
            }
            java.util.regex.Matcher matcher2 = l.matcher(altpVarA.h(str));
            if (matcher2.find()) {
                defpackage.altp altpVarD = altpVarA.d(matcher2.start());
                java.lang.String strH = altpVarD.h(str);
                java.lang.String strTrim = strH.trim();
                int iIndexOf = strH.indexOf(strTrim);
                alto altoVar2 = new alto();
                int i3 = altpVarD.a + iIndexOf;
                altoVar2.c(i3);
                altoVar2.b(i3 + strTrim.length());
                defpackage.altp altpVarA2 = altoVar2.a();
                optionalEmpty = j$.util.Optional.of(new defpackage.amet(altpVarA2.h(str).replace("'", "").trim(), altpVarA2));
            } else {
                optionalEmpty = j$.util.Optional.empty();
            }
            if (optionalEmpty.isEmpty()) {
                altpVar = altpVar.e(((defpackage.amet) optionalC.get()).b);
                optionalC = c(str, altpVar);
            }
        }
        if (optionalC.isEmpty()) {
            return j$.util.Optional.empty();
        }
        defpackage.amds amdsVar = new defpackage.amds(optionalC, i2, amcpVar);
        if (true != optionalEmpty.isPresent()) {
            return optionalEmpty;
        }
        java.lang.Object obj = optionalEmpty.get();
        j$.util.Optional optional = amdsVar.a;
        int i4 = amdsVar.b;
        defpackage.amcp amcpVar2 = amdsVar.c;
        defpackage.amet ametVar = (defpackage.amet) obj;
        defpackage.altp altpVar2 = ametVar.b;
        defpackage.altp altpVar3 = ((defpackage.amet) optional.get()).b;
        int i5 = altpVar2.a;
        int i6 = altpVar3.b;
        ahvr.bT(i5 <= i6, "Start: %s must be less than end: %s", i5, i6);
        alto altoVar3 = new alto();
        altoVar3.c(i5);
        altoVar3.b(i6);
        defpackage.altp altpVarA3 = altoVar3.a();
        akzx akzxVarM = defpackage.amgc.a.m();
        java.lang.String str2 = ((defpackage.amet) optional.get()).a;
        akzxVarM.u();
        defpackage.amgc amgcVar = (defpackage.amgc) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        amgcVar.b |= 1;
        amgcVar.c = str2;
        java.lang.String str3 = ametVar.a;
        akzxVarM.u();
        defpackage.amgc amgcVar2 = (defpackage.amgc) akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        amgcVar2.b |= 4;
        amgcVar2.d = str3;
        akzx akzxVarM2 = defpackage.amgb.a.m();
        int i7 = altpVarA3.a;
        akzxVarM2.u();
        defpackage.amgb amgbVar = (defpackage.amgb) akzxVarM2.b;
        amgbVar.b |= 1;
        amgbVar.c = i7 + i4;
        int i8 = altpVarA3.b;
        akzxVarM2.u();
        defpackage.amgb amgbVar2 = (defpackage.amgb) akzxVarM2.b;
        amgbVar2.b |= 2;
        amgbVar2.d = i4 + i8;
        akzxVarM.u();
        defpackage.amgc amgcVar3 = (defpackage.amgc) akzxVarM.b;
        defpackage.amgb amgbVar3 = (defpackage.amgb) akzxVarM2.p();
        j$.util.Objects.requireNonNull(amgbVar3);
        amgcVar3.f = amgbVar3;
        amgcVar3.b |= 16;
        akzx akzxVarM3 = defpackage.amfy.a.m();
        java.lang.String strTrim2 = amcpVar2.b.substring(i7, i8).trim();
        akzxVarM3.u();
        defpackage.amfy amfyVar = (defpackage.amfy) akzxVarM3.b;
        j$.util.Objects.requireNonNull(strTrim2);
        amfyVar.b |= 1;
        amfyVar.c = strTrim2;
        alto altoVar4 = new alto();
        altoVar4.c(i7);
        altoVar4.b(i8);
        akzxVarM3.bd(amcpVar2.b(altoVar4.a()));
        akzxVarM.u();
        defpackage.amgc amgcVar4 = (defpackage.amgc) akzxVarM.b;
        defpackage.amfy amfyVar2 = (defpackage.amfy) akzxVarM3.p();
        j$.util.Objects.requireNonNull(amfyVar2);
        amgcVar4.e = amfyVar2;
        amgcVar4.b |= 8;
        return j$.util.Optional.ofNullable((defpackage.amgc) akzxVarM.p());
    }

    @Override // defpackage.amdf
    public final aify a(defpackage.amcp amcpVar, defpackage.altp altpVar, int i2) {
        aift aiftVar = new aift(4);
        j$.util.Optional optionalD = d(amcpVar, altpVar, i2);
        while (optionalD.isPresent()) {
            aiftVar.i((defpackage.amgc) optionalD.get());
            defpackage.amgb amgbVar = ((defpackage.amgc) optionalD.get()).f;
            if (amgbVar == null) {
                amgbVar = defpackage.amgb.a;
            }
            alto altoVar = new alto();
            altoVar.c(amgbVar.c);
            altoVar.b(amgbVar.d);
            defpackage.altp altpVarA = altoVar.a();
            altpVar = altpVar.e(defpackage.altp.b(altpVarA.a - i2, altpVarA.b - i2));
            optionalD = d(amcpVar, altpVar, i2);
        }
        return (aify) j$.util.Collection.-EL.stream(aiftVar.h()).map(new defpackage.amdk(12)).collect(aido.a);
    }

    @Override // defpackage.amdf
    public final ajcq b(defpackage.alqk alqkVar) {
        return ajcm.a;
    }
}
