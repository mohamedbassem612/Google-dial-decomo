package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rag implements aood {
    public final /* synthetic */ defpackage.rah a;

    public rag(defpackage.rah rahVar) {
        this.a = rahVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof defpackage.rag) && (obj instanceof aood)) {
            return aooh.n(ex(), ((aood) obj).ex());
        }
        return false;
    }

    public final aoio ex() {
        return new aoof(0, this.a, defpackage.rah.class, "onMergeCompleted", "onMergeCompleted()Lcom/google/common/util/concurrent/ListenableFuture;", 0);
    }

    public final int hashCode() {
        return ex().hashCode();
    }
}
