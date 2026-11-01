package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qab extends defpackage.qaa {
    private final boolean a;

    public qab(boolean z) {
        this.a = z;
    }

    @Override // defpackage.qaa
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof defpackage.qaa) && this.a == ((defpackage.qaa) obj).a();
        }
        return true;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final java.lang.String toString() {
        return "AllowOrientationChangeUpdatedEvent{allowOrientationChange=" + this.a + '}';
    }
}
