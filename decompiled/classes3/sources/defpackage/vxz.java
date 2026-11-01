package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vxz {
    private static final aimz c = aimz.i("com/android/dialer/voicemail/tab/impl/ui/VoicemailEntryUiFormatter");
    public final android.content.Context a;
    public final aazc b;

    public vxz(aazc aazcVar, android.content.Context context) {
        this.b = aazcVar;
        this.a = context;
    }

    final java.lang.CharSequence a(long j, long j2) {
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        android.content.Context context = this.a;
        java.lang.CharSequence charSequenceQ = hgu.q(context, epochMilli, j);
        if (j2 <= 0) {
            return charSequenceQ;
        }
        long minutes = j$.time.Duration.ofMillis(j2).toMinutes();
        long seconds = j$.time.Duration.ofMillis(j2).minusMinutes(minutes).getSeconds();
        if (minutes > 99) {
            minutes = 99;
        }
        return context.getString(2132020832, charSequenceQ, context.getString(2132020834, java.lang.Long.valueOf(minutes), java.lang.Long.valueOf(seconds)));
    }

    final java.lang.String b(defpackage.uzm uzmVar) {
        switch (uzmVar.ordinal()) {
            case 0:
                a.bI(c.c().m(aioa.b), "Transcription status UNKNOWN!", "com/android/dialer/voicemail/tab/impl/ui/VoicemailEntryUiFormatter", "getTranscriptionBranding", 'G', "VoicemailEntryUiFormatter.java", zct.b);
                return "";
            case 1:
                return "";
            case 2:
                return this.a.getString(2132020962);
            case 3:
                return this.a.getString(2132020956);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return this.a.getString(2132020955);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return this.a.getString(2132020960);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return this.a.getString(2132020957);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return this.a.getString(2132020958);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return this.a.getString(2132020961);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return this.a.getString(2132020959);
            default:
                throw new java.lang.AssertionError("Exhaustive switch");
        }
    }

    final void c(android.widget.TextView textView, android.widget.TextView textView2, boolean z) {
        if (z) {
            textView.setTextAppearance(2132086260);
            textView2.setTextAppearance(2132086259);
        } else {
            textView.setTextAppearance(2132086258);
            textView.setTypeface(textView.getTypeface(), 1);
            textView2.setTextAppearance(2132086257);
        }
    }

    final void d(android.widget.TextView textView, kit kitVar) {
        j$.util.Optional optionalOf;
        int iOrdinal = kitVar.ordinal();
        if (iOrdinal == 1) {
            optionalOf = j$.util.Optional.of(this.a.getString(2132020858));
        } else if (iOrdinal != 2) {
            optionalOf = iOrdinal != 3 ? j$.util.Optional.empty() : j$.util.Optional.of(this.a.getString(2132020857));
        } else {
            optionalOf = j$.util.Optional.of(this.a.getString(2132020859));
        }
        if (!optionalOf.isPresent()) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText((java.lang.CharSequence) optionalOf.orElseThrow());
        }
    }
}
