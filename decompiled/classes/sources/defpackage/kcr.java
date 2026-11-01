package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kcr implements defpackage.kct {
    public final kbx a;

    public kcr(kbx kbxVar) {
        defpackage.aooh.f(kbxVar, "item");
        this.a = kbxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kcr) && defpackage.aooh.n(this.a, ((defpackage.kcr) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "CallLogItemUiModel(item=" + this.a + ')';
    }
}
