package com.android.dialer.voicemail.settings.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class RecordLottieViewContainer extends android.widget.FrameLayout {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/settings/widget/RecordLottieViewContainer");
    public final com.android.dialer.voicemail.settings.widget.RecordLottieView b;
    public final com.android.dialer.voicemail.settings.widget.RecordLottieView c;
    public int d;
    public int e;
    public defpackage.aprf f;
    private final com.android.dialer.voicemail.settings.widget.RecordLottieView g;

    public RecordLottieViewContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, 2131624402, this);
        this.d = 180000;
        this.e = 6000;
        com.android.dialer.voicemail.settings.widget.RecordLottieView recordLottieView = (com.android.dialer.voicemail.settings.widget.RecordLottieView) findViewById(2131428766);
        this.b = recordLottieView;
        com.android.dialer.voicemail.settings.widget.RecordLottieView recordLottieView2 = (com.android.dialer.voicemail.settings.widget.RecordLottieView) findViewById(2131428688);
        this.c = recordLottieView2;
        this.g = (com.android.dialer.voicemail.settings.widget.RecordLottieView) findViewById(2131428692);
        byte[] bArr = null;
        recordLottieView.setOnClickListener(new defpackage.szl(this, 18, bArr));
        recordLottieView2.setOnClickListener(new defpackage.szl(this, 19, bArr));
    }

    public final void a(int i, float f) {
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            this.b.setVisibility(0);
            this.c.setVisibility(8);
            this.g.setVisibility(8);
        } else {
            this.b.setVisibility(4);
            this.c.setVisibility(0);
            this.g.setVisibility(0);
        }
        switch (i - 1) {
            case 0:
                com.android.dialer.voicemail.settings.widget.RecordLottieView recordLottieView = this.b;
                recordLottieView.r(1.0f);
                recordLottieView.t(defpackage.vtk.b, null);
                break;
            case 1:
                com.android.dialer.voicemail.settings.widget.RecordLottieView recordLottieView2 = this.b;
                recordLottieView2.r(1.0f);
                recordLottieView2.t(defpackage.vtk.c, new defpackage.aprf(this));
                break;
            case 2:
                com.android.dialer.voicemail.settings.widget.RecordLottieView recordLottieView3 = this.b;
                recordLottieView3.r(180000.0f / this.d);
                recordLottieView3.t(defpackage.vtk.d, null);
                if (f != 0.0f) {
                    recordLottieView3.o(f, true);
                }
                break;
            case 3:
                com.android.dialer.voicemail.settings.widget.RecordLottieView recordLottieView4 = this.b;
                recordLottieView4.d();
                defpackage.aprf aprfVar = new defpackage.aprf(this);
                android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
                alphaAnimation.setDuration(80L);
                android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 0.5f, 1.0f, 0.5f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(80L);
                scaleAnimation.setRepeatCount(-1);
                android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
                animationSet.addAnimation(alphaAnimation);
                animationSet.addAnimation(scaleAnimation);
                alphaAnimation.setAnimationListener(new defpackage.vtj(recordLottieView4, alphaAnimation, aprfVar));
                recordLottieView4.d();
                recordLottieView4.startAnimation(animationSet);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                this.b.clearAnimation();
                com.android.dialer.voicemail.settings.widget.RecordLottieView recordLottieView5 = this.c;
                defpackage.vtk vtkVar = defpackage.vtk.b;
                recordLottieView5.t(vtkVar, null);
                this.g.t(vtkVar, null);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                com.android.dialer.voicemail.settings.widget.RecordLottieView recordLottieView6 = this.c;
                defpackage.vtk vtkVar2 = defpackage.vtk.d;
                recordLottieView6.t(vtkVar2, null);
                com.android.dialer.voicemail.settings.widget.RecordLottieView recordLottieView7 = this.g;
                recordLottieView7.r(6000.0f / this.e);
                recordLottieView7.t(vtkVar2, null);
                if (f != 0.0f) {
                    recordLottieView7.o(f, true);
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                com.android.dialer.voicemail.settings.widget.RecordLottieView recordLottieView8 = this.c;
                defpackage.vtk vtkVar3 = defpackage.vtk.e;
                recordLottieView8.t(vtkVar3, null);
                this.g.t(vtkVar3, null);
                break;
            default:
                com.android.dialer.voicemail.settings.widget.RecordLottieView recordLottieView9 = this.c;
                defpackage.vtk vtkVar4 = defpackage.vtk.f;
                recordLottieView9.t(vtkVar4, null);
                this.g.t(vtkVar4, null);
                break;
        }
        defpackage.aprf aprfVar2 = this.f;
        if (aprfVar2 == null || i != 2) {
            return;
        }
        com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity recordVoicemailGreetingActivity = (com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) aprfVar2.a;
        recordVoicemailGreetingActivity.q.setText(2132019821);
        recordVoicemailGreetingActivity.q.setContentDescription(recordVoicemailGreetingActivity.getString(2132019821));
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.b.e == defpackage.vtk.c) {
            return true;
        }
        return super.performClick();
    }
}
