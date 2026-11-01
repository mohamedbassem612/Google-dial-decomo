package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vpp implements java.util.Iterator {
    private final aihd a;
    private int b = 1;

    public vpp(aihd aihdVar) {
        this.a = aihdVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.lang.Integer next() {
        while (true) {
            boolean zContains = this.a.contains(java.lang.Integer.valueOf(this.b));
            int i = this.b;
            if (!zContains) {
                this.b = i + 1;
                return java.lang.Integer.valueOf(i);
            }
            this.b = i + 1;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return true;
    }
}
