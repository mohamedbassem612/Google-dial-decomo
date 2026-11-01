package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class sh extends defpackage.rm {
    public final int a;
    private final int b = 0;

    public sh(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sh) {
            defpackage.sh shVar = (defpackage.sh) obj;
            if (j$.util.Objects.equals(java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(shVar.a))) {
                int i = shVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), 0});
    }

    public final java.lang.String toString() {
        return "{joinableValueType: " + this.a + ", deletePropagationType: 0}";
    }
}
