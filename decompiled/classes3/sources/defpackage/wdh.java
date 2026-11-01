package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wdh {
    public final android.graphics.drawable.Drawable a;
    public final android.graphics.drawable.Drawable b;
    public final int c;
    public final java.lang.String d;
    public final defpackage.wdf e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public wdh(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, int i, java.lang.String str, defpackage.wdf wdfVar, boolean z, boolean z2, boolean z3) {
        this.a = drawable;
        this.b = drawable2;
        this.c = i;
        this.d = str;
        this.e = wdfVar;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public static defpackage.wdg a() {
        defpackage.wdg wdgVar = new defpackage.wdg();
        wdgVar.b(true);
        wdgVar.c(false);
        wdgVar.d(true);
        return wdgVar;
    }

    public final boolean equals(java.lang.Object obj) {
        android.graphics.drawable.Drawable drawable;
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.wdh) {
            defpackage.wdh wdhVar = (defpackage.wdh) obj;
            if (this.a.equals(wdhVar.a) && ((drawable = this.b) != null ? drawable.equals(wdhVar.b) : wdhVar.b == null) && this.c == wdhVar.c && ((str = this.d) != null ? str.equals(wdhVar.d) : wdhVar.d == null) && this.e.equals(wdhVar.e) && this.f == wdhVar.f && this.g == wdhVar.g && this.h == wdhVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        android.graphics.drawable.Drawable drawable = this.b;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (drawable == null ? 0 : drawable.hashCode())) * 1000003) ^ this.c) * 1000003;
        java.lang.String str = this.d;
        return ((((((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true == this.h ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        defpackage.wdf wdfVar = this.e;
        android.graphics.drawable.Drawable drawable = this.b;
        return "Action{iconDrawable=" + java.lang.String.valueOf(this.a) + ", secondaryIconDrawable=" + java.lang.String.valueOf(drawable) + ", nameRes=" + this.c + ", nameAlternative=" + this.d + ", actionType=" + java.lang.String.valueOf(wdfVar) + ", checkable=" + this.f + ", checked=" + this.g + ", enabled=" + this.h + '}';
    }

    public wdh() {
        throw null;
    }
}
