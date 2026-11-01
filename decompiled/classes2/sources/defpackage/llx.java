package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class llx {
    private static final aimz a = aimz.i("com/android/dialer/callscreen/impl/tts/client/LanguagePackInterpreter");
    private final defpackage.llu b;
    private final acui c;
    private final defpackage.lhr d;

    public llx(defpackage.llu lluVar, acui acuiVar, defpackage.lhr lhrVar) {
        this.b = lluVar;
        this.c = acuiVar;
        this.d = lhrVar;
    }

    private final akzx b(defpackage.llv llvVar) {
        pgi pgiVar = new pgi(llvVar, this.c);
        akzx akzxVarM = defpackage.lhu.a.m();
        java.lang.String str = llvVar.b;
        akzxVarM.u();
        defpackage.lhu lhuVar = (defpackage.lhu) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        lhuVar.b |= 1;
        lhuVar.c = str;
        defpackage.lhr lhrVar = this.d;
        boolean z = lhrVar.a().isPresent() && ((java.lang.String) lhrVar.a().orElseThrow()).equals(llvVar.b);
        akzxVarM.u();
        defpackage.lhu lhuVar2 = (defpackage.lhu) akzxVarM.b;
        lhuVar2.b |= 2;
        lhuVar2.d = z;
        defpackage.lll lllVar = defpackage.lll.LOCAL_CONTACT;
        java.lang.String string = pgiVar.y(lllVar).a.toString();
        akzxVarM.u();
        defpackage.lhu lhuVar3 = (defpackage.lhu) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        lhuVar3.b |= 4;
        lhuVar3.e = string;
        java.lang.String str2 = pgiVar.y(lllVar).b;
        akzxVarM.u();
        defpackage.lhu lhuVar4 = (defpackage.lhu) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        lhuVar4.b |= 8;
        lhuVar4.f = str2;
        return akzxVarM;
    }

    public final defpackage.lih a() {
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/callscreen/impl/tts/client/LanguagePackInterpreter", "voiceSettingsModel", 51, "LanguagePackInterpreter.java").y("enter - loadedUserSettings.voice() = %s", this.d.a());
        akzx akzxVarM = defpackage.lih.a.m();
        defpackage.llu lluVar = this.b;
        java.util.Iterator it = lluVar.d.iterator();
        boolean z = false;
        while (it.hasNext()) {
            akzx akzxVarB = b((defpackage.llv) it.next());
            aimw aimwVarL = aimzVar.b().l("com/android/dialer/callscreen/impl/tts/client/LanguagePackInterpreter", "voiceSettingsModel", 57, "LanguagePackInterpreter.java");
            defpackage.lhu lhuVar = (defpackage.lhu) akzxVarB.b;
            aimwVarL.J("adding voice %s, isChosenVoice: %b", lhuVar.c, lhuVar.d);
            akzxVarM.u();
            defpackage.lih lihVar = (defpackage.lih) akzxVarM.b;
            defpackage.lhu lhuVar2 = (defpackage.lhu) akzxVarB.p();
            j$.util.Objects.requireNonNull(lhuVar2);
            lihVar.b();
            lihVar.b.add(lhuVar2);
            z |= ((defpackage.lhu) akzxVarB.b).d;
        }
        defpackage.llv llvVar = lluVar.c;
        if (llvVar == null) {
            llvVar = defpackage.llv.a;
        }
        akzx akzxVarB2 = b(llvVar);
        aimw aimwVarL2 = aimzVar.b().l("com/android/dialer/callscreen/impl/tts/client/LanguagePackInterpreter", "voiceSettingsModel", 65, "LanguagePackInterpreter.java");
        defpackage.lhu lhuVar3 = (defpackage.lhu) akzxVarB2.b;
        aimwVarL2.J("adding voice %s, isChosenVoice: %b", lhuVar3.c, lhuVar3.d);
        if (!(z | ((defpackage.lhu) akzxVarB2.b).d)) {
            aimzVar.b().l("com/android/dialer/callscreen/impl/tts/client/LanguagePackInterpreter", "voiceSettingsModel", 71, "LanguagePackInterpreter.java").v("user hasn't chosen any recognized voice, setting default as chosen");
            akzxVarB2.u();
            defpackage.lhu lhuVar4 = (defpackage.lhu) akzxVarB2.b;
            lhuVar4.b |= 2;
            lhuVar4.d = true;
        }
        akzxVarM.u();
        defpackage.lih lihVar2 = (defpackage.lih) akzxVarM.b;
        defpackage.lhu lhuVar5 = (defpackage.lhu) akzxVarB2.p();
        j$.util.Objects.requireNonNull(lhuVar5);
        lihVar2.b();
        lihVar2.b.add(0, lhuVar5);
        return (defpackage.lih) akzxVarM.p();
    }
}
