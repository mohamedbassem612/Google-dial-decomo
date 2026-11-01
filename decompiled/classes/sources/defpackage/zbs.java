package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zbs implements defpackage.zbo {
    public final zbt a;

    public zbs(zbt zbtVar) {
        this.a = zbtVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.zbs) && this.a == ((defpackage.zbs) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "DeidentifiedCallingEvent(type=" + this.a + ')';
    }
}
