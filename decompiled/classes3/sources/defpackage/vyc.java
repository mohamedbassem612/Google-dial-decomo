package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vyc {
    public final android.view.ViewGroup a;
    public final android.widget.FrameLayout b;
    public final android.widget.LinearLayout c;
    public final android.widget.LinearLayout d;
    public final android.widget.ImageView e;
    public final android.widget.ImageView f;
    public final android.widget.TextView g;
    public final android.widget.TextView h;
    public final android.widget.TextView i;

    public vyc(android.view.ViewGroup viewGroup, android.widget.FrameLayout frameLayout, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("Null container");
        }
        this.a = viewGroup;
        if (frameLayout == null) {
            throw new java.lang.NullPointerException("Null callRecordingPlayerContainer");
        }
        this.b = frameLayout;
        if (linearLayout == null) {
            throw new java.lang.NullPointerException("Null voicemailEntryActionsContainer");
        }
        this.c = linearLayout;
        if (linearLayout2 == null) {
            throw new java.lang.NullPointerException("Null voicemailTranscriptionRating");
        }
        this.d = linearLayout2;
        if (imageView == null) {
            throw new java.lang.NullPointerException("Null transcriptionRatingGood");
        }
        this.e = imageView;
        if (imageView2 == null) {
            throw new java.lang.NullPointerException("Null transcriptionRatingBad");
        }
        this.f = imageView2;
        if (textView == null) {
            throw new java.lang.NullPointerException("Null voicemailTranscription");
        }
        this.g = textView;
        if (textView2 == null) {
            throw new java.lang.NullPointerException("Null voicemailTranscriptionBranding");
        }
        this.h = textView2;
        if (textView3 == null) {
            throw new java.lang.NullPointerException("Null playerState");
        }
        this.i = textView3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vyc) {
            defpackage.vyc vycVar = (defpackage.vyc) obj;
            if (this.a.equals(vycVar.a) && this.b.equals(vycVar.b) && this.c.equals(vycVar.c) && this.d.equals(vycVar.d) && this.e.equals(vycVar.e) && this.f.equals(vycVar.f) && this.g.equals(vycVar.g) && this.h.equals(vycVar.h) && this.i.equals(vycVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final java.lang.String toString() {
        android.widget.TextView textView = this.i;
        android.widget.TextView textView2 = this.h;
        android.widget.TextView textView3 = this.g;
        android.widget.ImageView imageView = this.f;
        android.widget.ImageView imageView2 = this.e;
        android.widget.LinearLayout linearLayout = this.d;
        android.widget.LinearLayout linearLayout2 = this.c;
        android.widget.FrameLayout frameLayout = this.b;
        return "ExpandedViewHolder{container=" + this.a.toString() + ", callRecordingPlayerContainer=" + frameLayout.toString() + ", voicemailEntryActionsContainer=" + linearLayout2.toString() + ", voicemailTranscriptionRating=" + linearLayout.toString() + ", transcriptionRatingGood=" + imageView2.toString() + ", transcriptionRatingBad=" + imageView.toString() + ", voicemailTranscription=" + textView3.toString() + ", voicemailTranscriptionBranding=" + textView2.toString() + ", playerState=" + textView.toString() + '}';
    }

    public vyc() {
        throw null;
    }
}
