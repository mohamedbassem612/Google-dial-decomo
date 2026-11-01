package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acko {
    public final android.view.View a;
    public final ahyn b;
    public final java.lang.CharSequence c;
    public final android.view.View.OnClickListener d;
    public final java.lang.CharSequence e;
    public final boolean f;
    public final ahyn g;
    public final ahyn h;
    public final java.lang.CharSequence i;
    public final ahyn j;
    public final android.view.View.OnClickListener k;
    public final android.widget.PopupWindow.OnDismissListener l;
    public final android.view.View.OnClickListener m;
    public final float n;
    public final int o;
    public final int p;

    public acko(android.view.View view, ahyn ahynVar, java.lang.CharSequence charSequence, android.view.View.OnClickListener onClickListener, java.lang.CharSequence charSequence2, boolean z, ahyn ahynVar2, ahyn ahynVar3, java.lang.CharSequence charSequence3, ahyn ahynVar4, android.view.View.OnClickListener onClickListener2, android.widget.PopupWindow.OnDismissListener onDismissListener, android.view.View.OnClickListener onClickListener3, int i, int i2, float f) {
        this.a = view;
        this.b = ahynVar;
        this.c = charSequence;
        this.d = onClickListener;
        this.e = charSequence2;
        this.f = z;
        this.g = ahynVar2;
        this.h = ahynVar3;
        this.i = charSequence3;
        this.j = ahynVar4;
        this.k = onClickListener2;
        this.l = onDismissListener;
        this.m = onClickListener3;
        this.o = i;
        this.p = i2;
        this.n = f;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.CharSequence charSequence;
        android.view.View.OnClickListener onClickListener;
        java.lang.CharSequence charSequence2;
        java.lang.CharSequence charSequence3;
        android.view.View.OnClickListener onClickListener2;
        android.widget.PopupWindow.OnDismissListener onDismissListener;
        android.view.View.OnClickListener onClickListener3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acko) {
            defpackage.acko ackoVar = (defpackage.acko) obj;
            if (this.a.equals(ackoVar.a) && this.b.equals(ackoVar.b) && ((charSequence = this.c) != null ? charSequence.equals(ackoVar.c) : ackoVar.c == null) && ((onClickListener = this.d) != null ? onClickListener.equals(ackoVar.d) : ackoVar.d == null) && ((charSequence2 = this.e) != null ? charSequence2.equals(ackoVar.e) : ackoVar.e == null) && this.f == ackoVar.f && this.g.equals(ackoVar.g) && this.h.equals(ackoVar.h) && ((charSequence3 = this.i) != null ? charSequence3.equals(ackoVar.i) : ackoVar.i == null) && this.j.equals(ackoVar.j) && ((onClickListener2 = this.k) != null ? onClickListener2.equals(ackoVar.k) : ackoVar.k == null) && ((onDismissListener = this.l) != null ? onDismissListener.equals(ackoVar.l) : ackoVar.l == null) && ((onClickListener3 = this.m) != null ? onClickListener3.equals(ackoVar.m) : ackoVar.m == null)) {
                int i = this.o;
                int i2 = ackoVar.o;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.p;
                    int i4 = ackoVar.p;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4) {
                        if (java.lang.Float.floatToIntBits(this.n) == java.lang.Float.floatToIntBits(ackoVar.n)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        java.lang.CharSequence charSequence = this.c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        android.view.View.OnClickListener onClickListener = this.d;
        int iHashCode3 = (iHashCode2 ^ (onClickListener == null ? 0 : onClickListener.hashCode())) * 1000003;
        java.lang.CharSequence charSequence2 = this.e;
        int iHashCode4 = (((((((iHashCode3 ^ (charSequence2 == null ? 0 : charSequence2.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        java.lang.CharSequence charSequence3 = this.i;
        int iHashCode5 = (((iHashCode4 ^ (charSequence3 == null ? 0 : charSequence3.hashCode())) * 1000003) ^ this.j.hashCode()) * 1000003;
        android.view.View.OnClickListener onClickListener2 = this.k;
        int iHashCode6 = (iHashCode5 ^ (onClickListener2 == null ? 0 : onClickListener2.hashCode())) * 1000003;
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.l;
        int iHashCode7 = (iHashCode6 ^ (onDismissListener == null ? 0 : onDismissListener.hashCode())) * 1000003;
        android.view.View.OnClickListener onClickListener3 = this.m;
        int iHashCode8 = onClickListener3 != null ? onClickListener3.hashCode() : 0;
        int i = this.o;
        anty.aJ(i);
        int i2 = (((iHashCode7 ^ iHashCode8) * 1000003) ^ i) * 1000003;
        int i3 = this.p;
        anty.aJ(i3);
        return ((i2 ^ i3) * 1000003) ^ java.lang.Float.floatToIntBits(this.n);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0066  */
    /* JADX WARN: Code duplicated, block: B:13:0x0069  */
    /* JADX WARN: Code duplicated, block: B:14:0x006c  */
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        int i;
        java.lang.String str3;
        int i2 = this.o;
        android.view.View.OnClickListener onClickListener = this.m;
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.l;
        android.view.View.OnClickListener onClickListener2 = this.k;
        ahyn ahynVar = this.j;
        java.lang.CharSequence charSequence = this.i;
        ahyn ahynVar2 = this.h;
        ahyn ahynVar3 = this.g;
        java.lang.CharSequence charSequence2 = this.e;
        android.view.View.OnClickListener onClickListener3 = this.d;
        java.lang.CharSequence charSequence3 = this.c;
        ahyn ahynVar4 = this.b;
        java.lang.String strValueOf = java.lang.String.valueOf(this.a);
        java.lang.String strValueOf2 = java.lang.String.valueOf(ahynVar4);
        java.lang.String strValueOf3 = java.lang.String.valueOf(charSequence3);
        java.lang.String strValueOf4 = java.lang.String.valueOf(onClickListener3);
        java.lang.String strValueOf5 = java.lang.String.valueOf(charSequence2);
        java.lang.String strValueOf6 = java.lang.String.valueOf(ahynVar3);
        java.lang.String strValueOf7 = java.lang.String.valueOf(ahynVar2);
        java.lang.String strValueOf8 = java.lang.String.valueOf(charSequence);
        java.lang.String strValueOf9 = java.lang.String.valueOf(ahynVar);
        java.lang.String strValueOf10 = java.lang.String.valueOf(onClickListener2);
        java.lang.String strValueOf11 = java.lang.String.valueOf(onDismissListener);
        java.lang.String strValueOf12 = java.lang.String.valueOf(onClickListener);
        if (i2 != 1) {
            if (i2 != 2) {
                str2 = "null";
            } else {
                str = "ANYWHERE";
            }
            i = this.p;
            if (i != 1) {
                str3 = "ABOVE";
            } else if (i != 2) {
                str3 = "null";
            } else {
                str3 = "BELOW";
            }
            return "TooltipModel{targetView=" + strValueOf + ", backgroundColor=" + strValueOf2 + ", titleText=" + strValueOf3 + ", targetViewClickListener=" + strValueOf4 + ", detailText=" + strValueOf5 + ", isHtmlBodyText=" + this.f + ", textColor=" + strValueOf6 + ", titleColor=" + strValueOf7 + ", actionText=" + strValueOf8 + ", actionTextColor=" + strValueOf9 + ", actionListener=" + strValueOf10 + ", dismissListener=" + strValueOf11 + ", userClickedListener=" + strValueOf12 + ", tapDismissalType=" + str2 + ", placement=" + str3 + ", maxWidthPercentage=" + this.n + '}';
        }
        str = "INTERNAL";
        str2 = str;
        i = this.p;
        if (i != 1) {
            str3 = "ABOVE";
        } else if (i != 2) {
            str3 = "null";
        } else {
            str3 = "BELOW";
        }
        return "TooltipModel{targetView=" + strValueOf + ", backgroundColor=" + strValueOf2 + ", titleText=" + strValueOf3 + ", targetViewClickListener=" + strValueOf4 + ", detailText=" + strValueOf5 + ", isHtmlBodyText=" + this.f + ", textColor=" + strValueOf6 + ", titleColor=" + strValueOf7 + ", actionText=" + strValueOf8 + ", actionTextColor=" + strValueOf9 + ", actionListener=" + strValueOf10 + ", dismissListener=" + strValueOf11 + ", userClickedListener=" + strValueOf12 + ", tapDismissalType=" + str2 + ", placement=" + str3 + ", maxWidthPercentage=" + this.n + '}';
    }

    public acko() {
        throw null;
    }
}
