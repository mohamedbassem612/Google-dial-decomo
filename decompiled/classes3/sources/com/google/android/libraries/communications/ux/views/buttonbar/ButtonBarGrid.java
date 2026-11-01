package com.google.android.libraries.communications.ux.views.buttonbar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ButtonBarGrid extends android.widget.FrameLayout {
    public final defpackage.abpa a;
    public java.util.List b;
    public pez c;
    private final android.support.v7.widget.RecyclerView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonBarGrid(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        aooh.f(context, "context");
        android.widget.FrameLayout.inflate(context, 2131624044, this);
        android.support.v7.widget.RecyclerView recyclerViewFindViewById = findViewById(2131428772);
        aooh.e(recyclerViewFindViewById, "findViewById(...)");
        android.support.v7.widget.RecyclerView recyclerView = recyclerViewFindViewById;
        this.d = recyclerView;
        defpackage.abpa abpaVar = new defpackage.abpa(this);
        this.a = abpaVar;
        this.b = aokc.a;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.abpi.a, 0, 0);
        aooh.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int i3 = typedArrayObtainStyledAttributes.getInt(8, 4);
        typedArrayObtainStyledAttributes.recycle();
        recyclerView.aa(new abpc(context, i3));
        recyclerView.Y(abpaVar);
        recyclerView.Z((km) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonBarGrid(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonBarGrid(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonBarGrid(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        aooh.f(context, "context");
    }

    public /* synthetic */ ButtonBarGrid(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, aooc aoocVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
