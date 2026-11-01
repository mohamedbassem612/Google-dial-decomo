package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ackt extends defpackage.acku {
    private final int a;

    public ackt(int i) {
        this.a = i;
    }

    @Override // defpackage.acku, defpackage.ackx
    public final int a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ackx)) {
            return false;
        }
        defpackage.ackx ackxVar = (defpackage.ackx) obj;
        ackxVar.b();
        return this.a == ackxVar.a();
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "AppStateValue{integer=" + this.a + '}';
    }

    @Override // defpackage.ackx
    public final void b() {
    }
}
