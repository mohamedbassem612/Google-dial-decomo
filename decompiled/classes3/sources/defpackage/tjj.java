package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tjj {
    public final int a;
    public final j$.util.Optional b;
    public final int c;

    public tjj(int i, j$.util.Optional optional, int i2) {
        this.a = i;
        this.b = optional;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tjj) {
            defpackage.tjj tjjVar = (defpackage.tjj) obj;
            if (this.a == tjjVar.a && this.b.equals(tjjVar.b) && this.c == tjjVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final java.lang.String toString() {
        return "ButtonMetadata{stringId=" + this.a + ", contentDescriptionId=" + java.lang.String.valueOf(this.b) + ", drawableId=" + this.c + '}';
    }

    public tjj() {
        throw null;
    }
}
