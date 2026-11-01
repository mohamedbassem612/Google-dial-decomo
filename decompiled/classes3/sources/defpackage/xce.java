package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xce extends defpackage.xcj {
    public final int a;
    public final j$.util.Optional b;

    public xce(int i, j$.util.Optional optional) {
        this.a = i;
        this.b = optional;
    }

    @Override // defpackage.xcj
    public final int a() {
        return this.a;
    }

    @Override // defpackage.xcj
    public final j$.util.Optional b() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.xcj) {
            defpackage.xcj xcjVar = (defpackage.xcj) obj;
            if (this.a == xcjVar.a() && this.b.equals(xcjVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "RingingConfig{ringtoneRes=" + this.a + ", vibrationEffect=" + java.lang.String.valueOf(this.b) + '}';
    }
}
