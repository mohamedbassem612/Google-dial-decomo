package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mjg extends android.text.method.DialerKeyListener {
    public static final defpackage.mjg a = new defpackage.mjg();

    @Override // android.text.method.NumberKeyListener, android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
        java.lang.String strConvertKeypadLettersToDigits = android.telephony.PhoneNumberUtils.convertKeypadLettersToDigits(android.telephony.PhoneNumberUtils.replaceUnicodeDigits(charSequence.toString()));
        java.lang.CharSequence charSequenceFilter = super.filter(strConvertKeypadLettersToDigits, i, i2, spanned, i3, i4);
        if (charSequenceFilter != null) {
            return charSequenceFilter;
        }
        if (charSequence.toString().equals(strConvertKeypadLettersToDigits)) {
            return null;
        }
        return strConvertKeypadLettersToDigits.subSequence(i, i2);
    }
}
