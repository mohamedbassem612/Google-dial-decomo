package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wia {
    public final android.graphics.drawable.Drawable a;
    public final android.graphics.drawable.Drawable b;
    public final android.graphics.drawable.Drawable c;
    public final android.graphics.drawable.Drawable d;

    public wia(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        this.a = drawable;
        this.b = drawable2;
        this.c = drawable3;
        this.d = drawable4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.wia) {
            defpackage.wia wiaVar = (defpackage.wia) obj;
            if (this.a.equals(wiaVar.a) && this.b.equals(wiaVar.b) && this.c.equals(wiaVar.c) && this.d.equals(wiaVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final java.lang.String toString() {
        android.graphics.drawable.Drawable drawable = this.d;
        android.graphics.drawable.Drawable drawable2 = this.c;
        android.graphics.drawable.Drawable drawable3 = this.b;
        return "BackgroundDrawables{singleOptionDrawable=" + this.a.toString() + ", topOptionDrawable=" + drawable3.toString() + ", bottomOptionDrawable=" + drawable2.toString() + ", middleOptionDrawable=" + drawable.toString() + '}';
    }

    public wia() {
        throw null;
    }
}
