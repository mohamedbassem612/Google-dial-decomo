package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class akdg {
    public final long a;
    public final long b;

    public akdg(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.akdg) {
            defpackage.akdg akdgVar = (defpackage.akdg) obj;
            if (this.a == akdgVar.a && this.b == akdgVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((((int) ((j2 >>> 32) ^ j2)) ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final java.lang.String toString() {
        return "LogReport{timestampMillis=" + this.a + ", size=" + this.b + '}';
    }

    public akdg() {
        throw null;
    }
}
