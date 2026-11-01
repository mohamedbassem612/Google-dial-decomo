package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kix implements defpackage.kob {
    public final java.lang.String a;
    public final android.view.View.OnClickListener b;

    public kix(java.lang.String str, android.view.View.OnClickListener onClickListener) {
        this.a = str;
        this.b = onClickListener;
    }

    public final int a() {
        return 2131624334;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kix) {
            defpackage.kix kixVar = (defpackage.kix) obj;
            if (aooh.n(this.a, kixVar.a) && aooh.n(this.b, kixVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        android.view.View.OnClickListener onClickListener = this.b;
        return iHashCode + (onClickListener == null ? 0 : onClickListener.hashCode());
    }

    public final java.lang.String toString() {
        return "AtlasXatuDetailsViewData(atlasXatuTitle=" + this.a + ", transcriptOnClickListener=" + this.b + ')';
    }
}
