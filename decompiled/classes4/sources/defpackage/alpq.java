package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alpq {
    public static final aifl a = aifl.a(java.util.Arrays.asList(defpackage.alpv.c("0", defpackage.alrf.DTMF_ZERO), defpackage.alpv.c("1", defpackage.alrf.DTMF_ONE), defpackage.alpv.c("2", defpackage.alrf.DTMF_TWO), defpackage.alpv.c("3", defpackage.alrf.DTMF_THREE), defpackage.alpv.c("4", defpackage.alrf.DTMF_FOUR), defpackage.alpv.c("5", defpackage.alrf.DTMF_FIVE), defpackage.alpv.c("6", defpackage.alrf.DTMF_SIX), defpackage.alpv.c("7", defpackage.alrf.DTMF_SEVEN), defpackage.alpv.c("8", defpackage.alrf.DTMF_EIGHT), defpackage.alpv.c("9", defpackage.alrf.DTMF_NINE), defpackage.alpv.c("*", defpackage.alrf.DTMF_ASTERISK), defpackage.alpv.c("#", defpackage.alrf.DTMF_POUND)));

    public static java.lang.String a(defpackage.alrg alrgVar) {
        return (java.lang.String) j$.util.Collection.-EL.stream(new alam(alrgVar.c, defpackage.alrg.a)).flatMap(new defpackage.alpp(0)).collect(j$.util.stream.Collectors.joining(""));
    }
}
