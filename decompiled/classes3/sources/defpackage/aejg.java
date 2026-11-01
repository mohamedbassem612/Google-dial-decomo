package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aejg {
    public final android.graphics.drawable.Drawable a;
    public final int b;
    public final java.lang.String c;
    public final int d;
    public final android.view.View.OnClickListener e;
    private final int f;
    private final ahyn g;

    public aejg(int i, android.graphics.drawable.Drawable drawable, int i2, java.lang.String str, int i3, android.view.View.OnClickListener onClickListener, ahyn ahynVar) {
        this.f = i;
        this.a = drawable;
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = onClickListener;
        this.g = ahynVar;
    }

    public final boolean equals(java.lang.Object obj) {
        android.graphics.drawable.Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aejg) {
            defpackage.aejg aejgVar = (defpackage.aejg) obj;
            if (this.f == aejgVar.f && ((drawable = this.a) != null ? drawable.equals(aejgVar.a) : aejgVar.a == null) && this.b == aejgVar.b && this.c.equals(aejgVar.c) && this.d == aejgVar.d && this.e.equals(aejgVar.e) && this.g.equals(aejgVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        android.graphics.drawable.Drawable drawable = this.a;
        return ((((((((((((this.f ^ 1000003) * 1000003) ^ (drawable == null ? 0 : drawable.hashCode())) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332;
    }

    public final java.lang.String toString() {
        ahyn ahynVar = this.g;
        android.view.View.OnClickListener onClickListener = this.e;
        return "SimpleActionSpec{id=" + this.f + ", icon=" + java.lang.String.valueOf(this.a) + ", iconResId=" + this.b + ", label=" + this.c + ", veId=" + this.d + ", onClickListener=" + java.lang.String.valueOf(onClickListener) + ", availabilityChecker=" + java.lang.String.valueOf(ahynVar) + '}';
    }

    public aejg() {
        throw null;
    }
}
