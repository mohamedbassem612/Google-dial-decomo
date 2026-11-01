package com.android.dialer.searchfragment.enhancedsearch.menu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class PrimaryActionButton extends android.support.v7.widget.AppCompatImageView {
    public PrimaryActionButton(android.content.Context context) {
        super(context);
        c();
    }

    private final void c() {
        setBackground(getContext().getDrawable(2131230893));
    }

    public final void a(defpackage.tjh tjhVar) {
        setEnabled(true);
        setOnClickListener(new defpackage.szl(tjhVar, 5, (byte[]) null));
    }

    public final void b(defpackage.tjj tjjVar) {
        setImageDrawable(getContext().getDrawable(tjjVar.c));
        j$.util.Optional optional = tjjVar.b;
        if (optional.isPresent()) {
            setContentDescription(getContext().getString(((java.lang.Integer) optional.orElseThrow()).intValue()));
        } else {
            setContentDescription(getContext().getString(tjjVar.a));
        }
    }

    public PrimaryActionButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public PrimaryActionButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }
}
