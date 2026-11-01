package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class toz {
    private final hxe a;

    public toz(hxe hxeVar) {
        aooh.f(hxeVar, "reason");
        this.a = hxeVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.toz) && this.a == ((defpackage.toz) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "AudioPlayFailed(reason=" + this.a + ')';
    }
}
