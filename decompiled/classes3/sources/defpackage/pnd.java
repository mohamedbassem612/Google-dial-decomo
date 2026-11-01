package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pnd {
    public final j$.util.Optional a;
    public final j$.util.Optional b;
    public final j$.util.Optional c;
    public final j$.util.Optional d;
    public final j$.util.Optional e;
    public final j$.util.Optional f;
    public final j$.util.Optional g;
    public final j$.util.Optional h;
    public final j$.util.Optional i;
    public final j$.util.Optional j;
    public final j$.util.Optional k;
    public final j$.util.Optional l;
    public final j$.util.Optional m;
    public final j$.util.Optional n;
    public final j$.util.Optional o;
    public final j$.util.Optional p;

    public pnd(j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3, j$.util.Optional optional4, j$.util.Optional optional5, j$.util.Optional optional6, j$.util.Optional optional7, j$.util.Optional optional8, j$.util.Optional optional9, j$.util.Optional optional10, j$.util.Optional optional11, j$.util.Optional optional12, j$.util.Optional optional13, j$.util.Optional optional14, j$.util.Optional optional15, j$.util.Optional optional16) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
        this.f = optional6;
        this.g = optional7;
        this.h = optional8;
        this.i = optional9;
        this.j = optional10;
        this.k = optional11;
        this.l = optional12;
        this.m = optional13;
        this.n = optional14;
        this.o = optional15;
        this.p = optional16;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.pnd) {
            defpackage.pnd pndVar = (defpackage.pnd) obj;
            if (this.a.equals(pndVar.a) && this.b.equals(pndVar.b) && this.c.equals(pndVar.c) && this.d.equals(pndVar.d) && this.e.equals(pndVar.e) && this.f.equals(pndVar.f) && this.g.equals(pndVar.g) && this.h.equals(pndVar.h) && this.i.equals(pndVar.i) && this.j.equals(pndVar.j) && this.k.equals(pndVar.k) && this.l.equals(pndVar.l) && this.m.equals(pndVar.m) && this.n.equals(pndVar.n) && this.o.equals(pndVar.o) && this.p.equals(pndVar.p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.p;
        j$.util.Optional optional2 = this.o;
        j$.util.Optional optional3 = this.n;
        j$.util.Optional optional4 = this.m;
        j$.util.Optional optional5 = this.l;
        j$.util.Optional optional6 = this.k;
        j$.util.Optional optional7 = this.j;
        j$.util.Optional optional8 = this.i;
        j$.util.Optional optional9 = this.h;
        j$.util.Optional optional10 = this.g;
        j$.util.Optional optional11 = this.f;
        j$.util.Optional optional12 = this.e;
        j$.util.Optional optional13 = this.d;
        j$.util.Optional optional14 = this.c;
        j$.util.Optional optional15 = this.b;
        return "ContactGridViews{contactGridLayout=" + java.lang.String.valueOf(this.a) + ", topRow=" + java.lang.String.valueOf(optional15) + ", middleRow=" + java.lang.String.valueOf(optional14) + ", bottomRow=" + java.lang.String.valueOf(optional13) + ", forwardedNumberTextView=" + java.lang.String.valueOf(optional12) + ", deviceNumberTextView=" + java.lang.String.valueOf(optional11) + ", validationIconImageView=" + java.lang.String.valueOf(optional10) + ", avatarImageView=" + java.lang.String.valueOf(optional9) + ", workIconImageView=" + java.lang.String.valueOf(optional8) + ", forwardIconImageView=" + java.lang.String.valueOf(optional7) + ", spamIconImageView=" + java.lang.String.valueOf(optional6) + ", bottomTextSwitcher=" + java.lang.String.valueOf(optional5) + ", emergencyDialingConnectivityChip=" + java.lang.String.valueOf(optional4) + ", bottomTimerView=" + java.lang.String.valueOf(optional3) + ", iconsContainerView=" + java.lang.String.valueOf(optional2) + ", indicatorsContainerView=" + java.lang.String.valueOf(optional) + '}';
    }

    public pnd() {
        throw null;
    }
}
