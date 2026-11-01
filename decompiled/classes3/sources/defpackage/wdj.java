package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wdj {
    public final int a;
    public final android.graphics.drawable.Icon b;
    public final android.graphics.drawable.Drawable c;
    public final int d;
    public final aify e;

    public wdj(int i, android.graphics.drawable.Icon icon, android.graphics.drawable.Drawable drawable, int i2, aify aifyVar) {
        this.a = i;
        this.b = icon;
        this.c = drawable;
        this.d = i2;
        this.e = aifyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        android.graphics.drawable.Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.wdj) {
            defpackage.wdj wdjVar = (defpackage.wdj) obj;
            if (this.a == wdjVar.a && this.b.equals(wdjVar.b) && ((drawable = this.c) != null ? drawable.equals(wdjVar.c) : wdjVar.c == null) && this.d == wdjVar.d && ahvr.aP(this.e, wdjVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
        android.graphics.drawable.Drawable drawable = this.c;
        return (((((iHashCode * 1000003) ^ (drawable == null ? 0 : drawable.hashCode())) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final java.lang.String toString() {
        aify aifyVar = this.e;
        android.graphics.drawable.Drawable drawable = this.c;
        return "BubbleInfo{primaryColor=" + this.a + ", primaryIcon=" + java.lang.String.valueOf(this.b) + ", avatar=" + java.lang.String.valueOf(drawable) + ", startingYPosition=" + this.d + ", actions=" + java.lang.String.valueOf(aifyVar) + '}';
    }

    public wdj() {
        throw null;
    }
}
