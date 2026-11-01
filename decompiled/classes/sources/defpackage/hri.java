package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class hri implements defpackage.enh, defpackage.aood {
    private final /* synthetic */ defpackage.aonj a;

    public hri(defpackage.aonj aonjVar) {
        this.a = aonjVar;
    }

    @Override // defpackage.enh
    public final /* synthetic */ void a(java.lang.Object obj) {
        this.a.a(obj);
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof defpackage.enh) && (obj instanceof defpackage.aood)) {
            return defpackage.aooh.n(this.a, ((defpackage.aood) obj).ex());
        }
        return false;
    }

    @Override // defpackage.aood
    public final defpackage.aoio ex() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
