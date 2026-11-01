package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lbz implements defpackage.koe {
    @Override // defpackage.koe
    public final defpackage.kod a(kiu kiuVar) {
        aooh.f(kiuVar, "row");
        if ((kiuVar.b & 67108864) != 0) {
            defpackage.kir kirVar = kiuVar.D;
            if (kirVar == null) {
                kirVar = defpackage.kir.a;
            }
            aooh.e(kirVar, "getCallScreenDetails(...)");
            java.lang.String str = kirVar.c;
            aooh.e(str, "getTranscriptSnippet(...)");
            if (str.length() > 0) {
                return new defpackage.kod(str, 2132086241);
            }
            java.lang.String str2 = kirVar.e;
            aooh.e(str2, "getEmptySnippetDescription(...)");
            if (str2.length() > 0) {
                return new defpackage.kod(str2, 2132086238);
            }
        }
        return null;
    }
}
