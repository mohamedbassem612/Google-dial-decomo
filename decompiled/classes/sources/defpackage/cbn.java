package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cbn extends defpackage.cbd {
    private final defpackage.cen a;

    public cbn(defpackage.cen cenVar, defpackage.aomy aomyVar) {
        super(aomyVar);
        this.a = cenVar;
    }

    @Override // defpackage.cbd
    public final defpackage.cdj b(java.lang.Object obj) {
        return new defpackage.cdj(this, obj, obj == null, this.a, null, true);
    }
}
