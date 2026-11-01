package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ikr implements defpackage.ikt {
    public final int a;

    public ikr(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ikr) && this.a == ((defpackage.ikr) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "WithFailure(failure=" + ((java.lang.Object) java.lang.Integer.toString(this.a - 2)) + ')';
    }
}
