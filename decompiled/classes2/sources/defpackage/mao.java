package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mao {
    public final java.lang.String a;
    public final j$.util.Optional b;
    public final int c;
    public final boolean d;
    public final android.view.View.OnClickListener e;
    public final j$.util.Optional f;
    public final j$.util.Optional g;
    public final j$.util.Optional h;

    public mao(java.lang.String str, j$.util.Optional optional, int i, boolean z, android.view.View.OnClickListener onClickListener, j$.util.Optional optional2, j$.util.Optional optional3, j$.util.Optional optional4) {
        this.a = str;
        this.b = optional;
        this.c = i;
        this.d = z;
        this.e = onClickListener;
        this.f = optional2;
        this.g = optional3;
        this.h = optional4;
    }

    public final boolean equals(java.lang.Object obj) {
        android.view.View.OnClickListener onClickListener;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.mao) {
            defpackage.mao maoVar = (defpackage.mao) obj;
            if (this.a.equals(maoVar.a) && this.b.equals(maoVar.b) && this.c == maoVar.c && this.d == maoVar.d && ((onClickListener = this.e) != null ? onClickListener.equals(maoVar.e) : maoVar.e == null) && this.f.equals(maoVar.f) && this.g.equals(maoVar.g) && this.h.equals(maoVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        android.view.View.OnClickListener onClickListener = this.e;
        return (((((((((((iHashCode * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (onClickListener == null ? 0 : onClickListener.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.h;
        j$.util.Optional optional2 = this.g;
        j$.util.Optional optional3 = this.f;
        android.view.View.OnClickListener onClickListener = this.e;
        return "ConversationHistoryAction{label=" + this.a + ", contentDescription=" + java.lang.String.valueOf(this.b) + ", drawableResId=" + this.c + ", isEnabled=" + this.d + ", onClickListener=" + java.lang.String.valueOf(onClickListener) + ", growthKitTag=" + java.lang.String.valueOf(optional3) + ", actionPopulatedGrowthKitEvent=" + java.lang.String.valueOf(optional2) + ", onClickEvent=" + java.lang.String.valueOf(optional) + '}';
    }

    public mao() {
        throw null;
    }
}
