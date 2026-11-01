package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sas extends defpackage.sal {
    public static final defpackage.sas a = new defpackage.sas();

    @Override // defpackage.sal
    public final void a(defpackage.akmv akmvVar, akzx akzxVar) {
        aooh.f(akmvVar, "from");
        aooh.f(akzxVar, "to");
        java.lang.String str = akmvVar.f;
        aooh.e(str, "getPhotoToken(...)");
        if (str.length() > 0) {
            java.lang.String str2 = akmvVar.f;
            akzxVar.u();
            defpackage.abxs abxsVar = (defpackage.abxs) akzxVar.b;
            defpackage.abxs abxsVar2 = defpackage.abxs.a;
            j$.util.Objects.requireNonNull(str2);
            abxsVar.b |= 16;
            abxsVar.g = str2;
        }
    }
}
