package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aicx extends defpackage.aijl implements java.util.Set {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aicx(defpackage.aicz aiczVar) {
        super(aiczVar);
        j$.util.Objects.requireNonNull(aiczVar);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        return defpackage.ahvr.at(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return defpackage.ahvr.al(this);
    }
}
