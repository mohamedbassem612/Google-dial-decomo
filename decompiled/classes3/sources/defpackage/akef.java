package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akef extends defpackage.akec {
    public final defpackage.aker a = new defpackage.aker(false);

    public final defpackage.akec b(java.lang.String str) {
        return (defpackage.akec) this.a.get(str);
    }

    public final java.util.Set c() {
        return this.a.entrySet();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof defpackage.akef) && ((defpackage.akef) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
