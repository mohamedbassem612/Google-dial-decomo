package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jtr {
    private static final aimz e = aimz.i("com/android/dialer/calleridfeedback/impl/logging/CallerInfoSuggestLogger");
    public final zzd a;
    public final defpackage.jtt b;
    public final android.content.Context c;
    public final zdi d;
    private final defpackage.krv f;

    public jtr(zzd zzdVar, defpackage.jtt jttVar, defpackage.krv krvVar, android.content.Context context, zdi zdiVar) {
        this.a = zzdVar;
        this.b = jttVar;
        this.f = krvVar;
        this.c = context;
        this.d = zdiVar;
    }

    public final akzx a(defpackage.jrz jrzVar, java.lang.String str) {
        akzx akzxVarM = defpackage.aixv.a.m();
        defpackage.hkd hkdVar = jrzVar.c;
        if (hkdVar == null) {
            hkdVar = defpackage.hkd.a;
        }
        java.lang.String str2 = hkdVar.c;
        akzxVarM.u();
        defpackage.aixv aixvVar = (defpackage.aixv) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        aixvVar.b |= 1;
        aixvVar.c = str2;
        defpackage.aixy aixyVarC = this.f.c(jrzVar, str);
        akzxVarM.u();
        defpackage.aixv aixvVar2 = (defpackage.aixv) akzxVarM.b;
        j$.util.Objects.requireNonNull(aixyVarC);
        aixvVar2.h = aixyVarC;
        aixvVar2.b |= 32;
        defpackage.kiw kiwVar = jrzVar.d;
        if (kiwVar == null) {
            kiwVar = defpackage.kiw.a;
        }
        if (!kiwVar.c.isEmpty()) {
            defpackage.kiw kiwVar2 = jrzVar.d;
            if (kiwVar2 == null) {
                kiwVar2 = defpackage.kiw.a;
            }
            rmt rmtVarB = rmt.b(kiwVar2.o);
            if (rmtVarB == null) {
                rmtVarB = rmt.a;
            }
            if (!defpackage.hhv.i(rmtVarB)) {
                e.d().l("com/android/dialer/calleridfeedback/impl/logging/CallerInfoSuggestLogger", "createCallerInfoSuggestLogBuilder", 103, "CallerInfoSuggestLogger.java").v("Contact source is supposed to be Google, but it is not.");
            }
            defpackage.kiw kiwVar3 = jrzVar.d;
            if (kiwVar3 == null) {
                kiwVar3 = defpackage.kiw.a;
            }
            java.lang.String str3 = kiwVar3.c;
            akzxVarM.u();
            defpackage.aixv aixvVar3 = (defpackage.aixv) akzxVarM.b;
            j$.util.Objects.requireNonNull(str3);
            aixvVar3.b |= 2;
            aixvVar3.d = str3;
        }
        defpackage.kiw kiwVar4 = jrzVar.d;
        if (kiwVar4 == null) {
            kiwVar4 = defpackage.kiw.a;
        }
        zag zagVar = kiwVar4.u;
        if (zagVar == null) {
            zagVar = zag.a;
        }
        zai zaiVar = zagVar.c;
        if (zaiVar == null) {
            zaiVar = zai.a;
        }
        zai zaiVar2 = zai.a;
        if (!zaiVar.equals(zaiVar2)) {
            defpackage.kiw kiwVar5 = jrzVar.d;
            if (kiwVar5 == null) {
                kiwVar5 = defpackage.kiw.a;
            }
            zag zagVar2 = kiwVar5.u;
            if (zagVar2 == null) {
                zagVar2 = zag.a;
            }
            zai zaiVar3 = zagVar2.c;
            if (zaiVar3 != null) {
                zaiVar2 = zaiVar3;
            }
            java.lang.String str4 = zaiVar2.b;
            akzxVarM.u();
            defpackage.aixv aixvVar4 = (defpackage.aixv) akzxVarM.b;
            j$.util.Objects.requireNonNull(str4);
            aixvVar4.b |= 4;
            aixvVar4.e = str4;
        }
        return akzxVarM;
    }
}
