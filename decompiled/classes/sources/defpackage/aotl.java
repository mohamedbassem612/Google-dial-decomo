package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aotl implements defpackage.aotx {
    public final boolean a;

    public aotl(boolean z) {
        this.a = z;
    }

    @Override // defpackage.aotx
    public final boolean fA() {
        return this.a;
    }

    @Override // defpackage.aotx
    public final defpackage.aouq fy() {
        return null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Empty{");
        sb.append(true != this.a ? "New" : "Active");
        sb.append('}');
        return sb.toString();
    }
}
