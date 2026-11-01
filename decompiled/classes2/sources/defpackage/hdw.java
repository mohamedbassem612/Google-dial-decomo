package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hdw implements defpackage.hdo {
    public final java.lang.String a;
    public final defpackage.hdb b;
    public final defpackage.hdb c;
    public final defpackage.hdk d;
    public final boolean e;

    public hdw(java.lang.String str, defpackage.hdb hdbVar, defpackage.hdb hdbVar2, defpackage.hdk hdkVar, boolean z) {
        this.a = str;
        this.b = hdbVar;
        this.c = hdbVar2;
        this.d = hdkVar;
        this.e = z;
    }

    @Override // defpackage.hdo
    public final defpackage.hag a(defpackage.gzs gzsVar, defpackage.gzh gzhVar, defpackage.hef hefVar) {
        return new defpackage.hat(gzsVar, hefVar, this);
    }
}
