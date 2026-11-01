package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class abkk implements aono {
    public final /* synthetic */ defpackage.abjt a;
    public final /* synthetic */ long b;

    public /* synthetic */ abkk(defpackage.abjt abjtVar, long j) {
        this.a = abjtVar;
        this.b = j;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.awv awvVar = (defpackage.awv) obj;
        cav cavVar = (cav) obj2;
        int iIntValue = ((java.lang.Integer) obj3).intValue();
        aooh.f(awvVar, "$this$BoxWithConstraints");
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != cavVar.B(awvVar) ? 2 : 4;
        }
        if (cavVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
            long j = this.b;
            defpackage.abjt abjtVar = this.a;
            long jDs = ((dpf) cavVar.e(dfo.e)).ds((awvVar.b() * 0.6666f) + 0.0f);
            abrz.k(java.lang.String.valueOf(abjtVar.a), afsq.bD(awvVar.a.a(cmw.c, cmh.e)), j, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, dkz.z(den.an(cavVar).f, 0L, jDs, (dnd) null, (dmw) null, (dmq) null, (java.lang.String) null, 0L, 0L, (dou) null, 0, jDs, (dki) null, (dos) null, 0, 0, 16646141), cavVar, 0, 0, 131064);
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
