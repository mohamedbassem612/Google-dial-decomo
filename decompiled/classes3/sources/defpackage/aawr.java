package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aawr implements defpackage.aavu {
    private final defpackage.aprf a;

    public aawr(defpackage.aprf aprfVar) {
        this.a = aprfVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((defpackage.aawr) obj).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aavu
    public final void g(com.google.android.gms.wearable.Channel channel) {
        ahvr.cj(channel, "channel must not be null");
        ((defpackage.aawl) this.a.a).c(channel);
    }

    @Override // defpackage.aavu
    public final void h(com.google.android.gms.wearable.Channel channel) {
        ahvr.cj(channel, "channel must not be null");
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.aavu
    public final void i(com.google.android.gms.wearable.Channel channel) {
        ahvr.cj(channel, "channel must not be null");
    }

    @Override // defpackage.aavu
    public final void j(com.google.android.gms.wearable.Channel channel) {
        ahvr.cj(channel, "channel must not be null");
    }
}
