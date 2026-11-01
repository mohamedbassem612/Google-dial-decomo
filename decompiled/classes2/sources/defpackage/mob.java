package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mob implements defpackage.koe {
    private static final aimz a = aimz.i("com/android/dialer/dobby/impl/calllog/DobbyCallLogTextSnippetLineIntegration");
    private final aoin b;
    private final kaw c;
    private final rsr d;

    public mob(rsr rsrVar, kaw kawVar, aoin aoinVar) {
        aooh.f(aoinVar, "enableAgenticCallScreen");
        this.d = rsrVar;
        this.c = kawVar;
        this.b = aoinVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    @Override // defpackage.koe
    public final defpackage.kod a(kiu kiuVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.CharSequence charSequenceB;
        aooh.f(kiuVar, "row");
        mmy mmyVarO = this.d.O(kiuVar);
        if (mmyVarO.m) {
            int i = kiuVar.q;
            if (i != 1) {
                if (i == 3 || i == 5) {
                    str = mmyVarO.c;
                    aooh.e(str, "getTranscriptSnippet(...)");
                    if (str.length() > 0) {
                        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
                            charSequenceB = str;
                            charSequenceB = str;
                            charSequenceB = this.c.B(str);
                        }
                        charSequenceB = str;
                        charSequenceB = str;
                        charSequenceB = str;
                        return new defpackage.kod(charSequenceB, 2132086243);
                    }
                    str2 = mmyVarO.d;
                    aooh.e(str2, "getFallbackSnippet(...)");
                    if (str2.length() > 0) {
                        return new defpackage.kod(str2, 2132086242);
                    }
                } else {
                    a.d().l("com/android/dialer/dobby/impl/calllog/DobbyCallLogTextSnippetLineIntegration", "shouldShowTextSnippetLineForBam", 66, "DobbyCallLogTextSnippetLineIntegration.kt").w("Unexpected call type for BAM: %d", i);
                }
            }
        } else {
            str = mmyVarO.c;
            aooh.e(str, "getTranscriptSnippet(...)");
            if (str.length() > 0) {
                if (((java.lang.Boolean) this.b.a()).booleanValue() && mmyVarO.e) {
                    charSequenceB = str;
                    charSequenceB = str;
                    charSequenceB = this.c.B(str);
                }
                charSequenceB = str;
                charSequenceB = str;
                charSequenceB = str;
                return new defpackage.kod(charSequenceB, 2132086243);
            }
            str2 = mmyVarO.d;
            aooh.e(str2, "getFallbackSnippet(...)");
            if (str2.length() > 0) {
                return new defpackage.kod(str2, 2132086242);
            }
        }
        return null;
    }
}
