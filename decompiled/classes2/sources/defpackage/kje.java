package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kje implements defpackage.kob {
    public final java.lang.CharSequence a;
    public final defpackage.kjg b;
    public final int c;
    public final android.view.View.OnClickListener d;
    public final java.lang.CharSequence e;
    private final int f = 2132018190;

    public kje(java.lang.CharSequence charSequence, defpackage.kjg kjgVar, int i, android.view.View.OnClickListener onClickListener, java.lang.CharSequence charSequence2) {
        this.a = charSequence;
        this.b = kjgVar;
        this.c = i;
        this.d = onClickListener;
        this.e = charSequence2;
    }

    public final int a() {
        return 2131624004;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kje) {
            defpackage.kje kjeVar = (defpackage.kje) obj;
            if (aooh.n(this.a, kjeVar.a) && aooh.n(this.b, kjeVar.b)) {
                int i = kjeVar.f;
                if (this.c == kjeVar.c && aooh.n(this.d, kjeVar.d) && aooh.n(this.e, kjeVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.kjg kjgVar = this.b;
        int iHashCode2 = (((((((iHashCode + (kjgVar == null ? 0 : kjgVar.hashCode())) * 31) + 2132018190) * 31) + this.c) * 31) + this.d.hashCode()) * 31;
        java.lang.CharSequence charSequence = this.e;
        return iHashCode2 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CallScreenTranscriptViewData(snippetText=" + ((java.lang.Object) this.a) + ", transcriptRecordingViewData=" + this.b + ", visibleLinkTextViewResInt=2132018190, visibleLinkTextViewBackgroundColor=" + this.c + ", overlappingTranscriptOnClickListener=" + this.d + ", transcriptTitleText=" + ((java.lang.Object) this.e) + ')';
    }
}
