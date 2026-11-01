package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aihf extends aihd {
    private final transient defpackage.aihg a;

    public aihf(defpackage.aihg aihgVar) {
        this.a = aihgVar;
    }

    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return this.a.u(entry.getKey(), entry.getValue());
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final ailj iterator() {
        return new defpackage.aigo(this.a);
    }

    public final boolean l() {
        return false;
    }

    public final int size() {
        return this.a.size;
    }

    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
