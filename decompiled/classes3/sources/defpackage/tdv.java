package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tdv extends kh {
    public static final aimz a = aimz.i("com/android/dialer/rtt/transcript/RttTranscriptAdapter");
    public defpackage.abwd e;
    public defpackage.tdt f;
    public int g;
    private final android.content.Context h;

    public tdv(android.content.Context context) {
        this.h = context;
    }

    public final int a() {
        defpackage.tdt tdtVar = this.f;
        if (tdtVar == null) {
            return 0;
        }
        return tdtVar.f.size();
    }

    public final /* bridge */ /* synthetic */ ld d(android.view.ViewGroup viewGroup, int i) {
        return new defpackage.tea(android.view.LayoutInflater.from(this.h).inflate(2131624413, viewGroup, false));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x010d  */
    /* JADX WARN: Code duplicated, block: B:46:0x010f  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    public final /* synthetic */ void m(ld ldVar, int i) {
        boolean z;
        int i2;
        int i3;
        defpackage.tea teaVar = (defpackage.tea) ldVar;
        defpackage.tdy tdyVar = (defpackage.tdy) this.f.f.get(i);
        if (i > 0) {
            if (tdyVar.e == ((defpackage.tdy) this.f.f.get(i - 1)).e) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        int i4 = i + 1;
        boolean z2 = i4 < a() && tdyVar.e == ((defpackage.tdy) this.f.f.get(i4)).e;
        defpackage.abwd abwdVar = this.e;
        android.widget.TextView textView = teaVar.s;
        textView.setText(tdyVar.c);
        android.view.View view = teaVar.v;
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = true != tdyVar.e ? 8388613 : 8388611;
        layoutParams.topMargin = z ? teaVar.t.getDimensionPixelSize(2131167343) : teaVar.t.getDimensionPixelSize(2131167342);
        view.setLayoutParams(layoutParams);
        if (!tdyVar.e) {
            textView.setTextColor(teaVar.y);
            textView.setBackgroundTintList(teaVar.A);
            teaVar.u.setVisibility(8);
            if (z) {
                if (z2) {
                    textView.setBackgroundResource(2131231791);
                    teaVar.w.setVisibility(8);
                    return;
                }
                textView.setBackgroundResource(2131231788);
                long j = tdyVar.d;
                boolean z3 = tdyVar.e;
                i2 = this.g;
                android.widget.TextView textView2 = teaVar.w;
                textView2.setVisibility(0);
                android.content.Context context = textView2.getContext();
                if (i != i2) {
                    i3 = 1;
                } else {
                    i3 = 17;
                }
                textView2.setText(android.text.format.DateUtils.formatDateTime(context, j, i3));
                textView2.setGravity(true == z3 ? 8388611 : 8388613);
            }
            if (z2) {
                textView.setBackgroundResource(2131231796);
                teaVar.w.setVisibility(8);
                return;
            }
            textView.setBackgroundResource(2131231845);
            long j2 = tdyVar.d;
            boolean z4 = tdyVar.e;
            i2 = this.g;
            android.widget.TextView textView3 = teaVar.w;
            textView3.setVisibility(0);
            android.content.Context context2 = textView3.getContext();
            if (i != i2) {
                i3 = 1;
            } else {
                i3 = 17;
            }
            textView3.setText(android.text.format.DateUtils.formatDateTime(context2, j2, i3));
            textView3.setGravity(true == z4 ? 8388611 : 8388613);
        }
        textView.setTextColor(teaVar.x);
        textView.setBackgroundTintList(teaVar.z);
        if (z) {
            teaVar.u.setVisibility(4);
            if (z2) {
                textView.setBackgroundResource(2131232074);
                teaVar.w.setVisibility(8);
                return;
            }
            textView.setBackgroundResource(2131232071);
            long j3 = tdyVar.d;
            boolean z5 = tdyVar.e;
            i2 = this.g;
            android.widget.TextView textView4 = teaVar.w;
            textView4.setVisibility(0);
            android.content.Context context3 = textView4.getContext();
            if (i != i2) {
                i3 = 1;
            } else {
                i3 = 17;
            }
            textView4.setText(android.text.format.DateUtils.formatDateTime(context3, j3, i3));
            textView4.setGravity(true == z5 ? 8388611 : 8388613);
        }
        android.widget.ImageView imageView = teaVar.u;
        imageView.setVisibility(0);
        ((tdz) agab.aH(view.getContext(), tdz.class)).iB().f(imageView, abwdVar, false);
        if (z2) {
            textView.setBackgroundResource(2131232079);
            teaVar.w.setVisibility(8);
            return;
        }
        textView.setBackgroundResource(2131231845);
        long j4 = tdyVar.d;
        boolean z6 = tdyVar.e;
        i2 = this.g;
        android.widget.TextView textView5 = teaVar.w;
        textView5.setVisibility(0);
        android.content.Context context4 = textView5.getContext();
        if (i != i2) {
            i3 = 1;
        } else {
            i3 = 17;
        }
        textView5.setText(android.text.format.DateUtils.formatDateTime(context4, j4, i3));
        textView5.setGravity(true == z6 ? 8388611 : 8388613);
    }
}
