package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class rhm extends android.widget.ArrayAdapter {
    private final int a;

    public rhm(android.content.Context context, java.util.List list, int i) {
        super(context, 2131624362, android.R.id.text2, list);
        this.a = i;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        int i2;
        int i3;
        android.view.View view2 = super.getView(i, view, viewGroup);
        com.android.dialer.interactions.PhoneNumberInteraction$PhoneItem phoneNumberInteraction$PhoneItem = (com.android.dialer.interactions.PhoneNumberInteraction$PhoneItem) getItem(i);
        ahvr.ck(phoneNumberInteraction$PhoneItem, "Null item at position: %s", i);
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(android.R.id.text1);
        int i4 = (int) phoneNumberInteraction$PhoneItem.e;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i4);
        java.lang.CharSequence text = phoneNumberInteraction$PhoneItem.f;
        android.content.Context context = getContext();
        j$.util.Objects.requireNonNull(context);
        numValueOf.getClass();
        if (i4 != 0 && i4 != 19) {
            int i5 = this.a;
            if (i5 == 2) {
                numValueOf.getClass();
                switch (i4) {
                    case 1:
                        i3 = 2132020155;
                        break;
                    case 2:
                        i3 = 2132020160;
                        break;
                    case 3:
                        i3 = 2132020167;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        i3 = 2132020154;
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        i3 = 2132020153;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        i3 = 2132020163;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        i3 = 2132020161;
                        break;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        i3 = 2132020148;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        i3 = 2132020149;
                        break;
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                        i3 = 2132020150;
                        break;
                    case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                        i3 = 2132020157;
                        break;
                    case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                        i3 = 2132020158;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                        i3 = 2132020162;
                        break;
                    case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                        i3 = 2132020164;
                        break;
                    case 15:
                        i3 = 2132020165;
                        break;
                    case 16:
                        i3 = 2132020166;
                        break;
                    case 17:
                        i3 = 2132020168;
                        break;
                    case 18:
                        i3 = 2132020169;
                        break;
                    case 19:
                        i3 = 2132020147;
                        break;
                    case 20:
                        i3 = 2132020159;
                        break;
                    default:
                        i3 = 2132020151;
                        break;
                }
            } else {
                numValueOf.getClass();
                switch (i4) {
                    case 1:
                        i2 = 2132017659;
                        break;
                    case 2:
                        i2 = 2132017730;
                        break;
                    case 3:
                        i2 = 2132017885;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        i2 = 2132017658;
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        i2 = 2132017657;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        i2 = 2132017748;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        i2 = 2132017746;
                        break;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        i2 = 2132017643;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        i2 = 2132017644;
                        break;
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                        i2 = 2132017645;
                        break;
                    case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                        i2 = 2132017687;
                        break;
                    case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                        i2 = 2132017727;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                        i2 = 2132017747;
                        break;
                    case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                        i2 = 2132017749;
                        break;
                    case 15:
                        i2 = 2132017874;
                        break;
                    case 16:
                        i2 = 2132017879;
                        break;
                    case 17:
                        i2 = 2132017886;
                        break;
                    case 18:
                        i2 = 2132017887;
                        break;
                    case 19:
                        i2 = 2132017634;
                        break;
                    case 20:
                        i2 = 2132017729;
                        break;
                    default:
                        i2 = 2132017646;
                        break;
                }
                if (i5 != 1) {
                    defpackage.rhj.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/interactions/ContactDisplayUtils", "getLabelForCallOrSms", 75, "ContactDisplayUtils.java").w("un-recognized interaction type: %d. Defaulting to ContactDisplayUtils.INTERACTION_CALL.", i5);
                }
                i3 = i2;
            }
            text = context.getResources().getText(i3);
        } else if (text == null) {
            text = "";
        }
        textView.setText(text);
        return view2;
    }
}
