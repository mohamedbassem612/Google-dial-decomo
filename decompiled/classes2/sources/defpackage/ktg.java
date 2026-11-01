package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ktg extends defpackage.ktr {
    private final java.lang.String a;

    public ktg(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null selectedMessage");
        }
        this.a = str;
    }

    @Override // defpackage.ktr
    public final java.lang.String a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ktr) {
            return this.a.equals(((defpackage.ktr) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "SubmitButtonClickEvent{selectedMessage=" + this.a + '}';
    }
}
