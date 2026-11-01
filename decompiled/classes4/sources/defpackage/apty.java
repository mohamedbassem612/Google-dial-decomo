package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apty extends java.text.SimpleDateFormat {
    private static final long serialVersionUID = 1;

    public apty() {
        super("EEE, d MMM yyyy HH:mm:ss ", java.util.Locale.US);
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat
    public final java.lang.StringBuffer format(java.util.Date date, java.lang.StringBuffer stringBuffer, java.text.FieldPosition fieldPosition) {
        java.lang.StringBuffer stringBuffer2 = super.format(date, stringBuffer, fieldPosition);
        int i = ((this.calendar.get(15) + this.calendar.get(16)) / 1000) / 60;
        if (i < 0) {
            stringBuffer2.append('-');
            i = -i;
        } else {
            stringBuffer2.append('+');
        }
        stringBuffer2.append(java.lang.String.format("%02d%02d", java.lang.Integer.valueOf(i / 60), java.lang.Integer.valueOf(i % 60)));
        return stringBuffer2;
    }
}
