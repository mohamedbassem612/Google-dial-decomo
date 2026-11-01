package com.google.android.libraries.onegoogle.account.particle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AccountParticle extends androidx.constraintlayout.widget.ConstraintLayout implements aeir, aelw {
    public final com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc j;
    public final android.widget.TextView k;
    public final android.widget.TextView l;
    public boolean m;
    public defpackage.alln n;
    private final android.widget.TextView o;

    /* JADX WARN: Multi-variable type inference failed */
    public AccountParticle(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.view.LayoutInflater.from(context).inflate(2131623968, (android.view.ViewGroup) this, true);
        com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc accountParticleDisc = (com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc) findViewById(2131427381);
        ahvr.ci(accountParticleDisc);
        this.j = accountParticleDisc;
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131428613);
        ahvr.ci(textView);
        this.k = textView;
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(2131428614);
        ahvr.ci(textView2);
        this.l = textView2;
        this.o = (android.widget.TextView) findViewById(2131427905);
        if (getBackground() != null) {
            super.setBackground(i(getBackground()));
        }
    }

    private final android.graphics.drawable.Drawable i(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        return com.google.android.material.focus.FocusRingDrawable.b(drawable) == null ? com.google.android.material.focus.FocusRingDrawable.a(getContext(), drawable) : drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(defpackage.aelt aeltVar) {
        if (this.m) {
            aeltVar.b(this, 90144);
            com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc accountParticleDisc = this.j;
            if (accountParticleDisc.h || accountParticleDisc.i) {
                accountParticleDisc.g = aeltVar;
                accountParticleDisc.b();
                if (accountParticleDisc.h) {
                    com.google.android.libraries.onegoogle.account.disc.BadgeFrameLayout badgeFrameLayout = accountParticleDisc.b;
                    badgeFrameLayout.c();
                    badgeFrameLayout.b(aeltVar);
                }
                if (accountParticleDisc.i) {
                    com.google.android.libraries.onegoogle.account.disc.RingFrameLayout ringFrameLayout = accountParticleDisc.c;
                    ringFrameLayout.c();
                    ringFrameLayout.b(aeltVar);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(defpackage.aelt aeltVar) {
        if (this.m) {
            com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc accountParticleDisc = this.j;
            if (accountParticleDisc.h) {
                accountParticleDisc.b.d(aeltVar);
            }
            if (accountParticleDisc.i) {
                accountParticleDisc.c.d(aeltVar);
            }
            aeltVar.c(this);
        }
    }

    public final android.widget.TextView e() {
        return this.o;
    }

    public final android.widget.TextView f() {
        return this.k;
    }

    public final android.widget.TextView g() {
        return this.l;
    }

    public final com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc h() {
        return this.j;
    }

    public final void setBackground(android.graphics.drawable.Drawable drawable) {
        super.setBackground(i(drawable));
    }

    public AccountParticle(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130970123);
    }

    public AccountParticle(android.content.Context context) {
        this(context, null);
    }
}
