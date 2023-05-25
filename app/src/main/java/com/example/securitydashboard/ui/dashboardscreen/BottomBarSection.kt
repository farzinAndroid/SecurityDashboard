package com.example.securitydashboard.ui.dashboardscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.securitydashboard.R

@Composable
fun BottomBarSection() {


    val items = listOf(

        BottomNavItem(
            selectedIcon = painterResource(R.drawable.baseline_dashboard_24),
        ),
        BottomNavItem(
            selectedIcon = painterResource(R.drawable.baseline_pie_chart_24),
        ),
        BottomNavItem(
            selectedIcon = painterResource(R.drawable.baseline_calendar_today_24),
        ),
        BottomNavItem(
            selectedIcon = painterResource(R.drawable.baseline_account_circle_24),
        )

    )


    BottomAppBar(
        modifier = Modifier
            .height(60.dp)
            .background(colorResource(R.color.cultured)),
        containerColor = colorResource(R.color.cultured),

        ) {

        items.forEachIndexed { index, item ->

            if (index == 0){
                Icon(
                    painter = item.selectedIcon,
                    contentDescription = "",
                    modifier = Modifier
                        .size(28.dp)
                        .weight(1f)
                        .clickable { },
                    tint = Color.Black
                )
            }else{
                Icon(
                    painter = item.selectedIcon,
                    contentDescription = "",
                    modifier = Modifier
                        .size(28.dp)
                        .weight(1f)
                        .clickable { },
                    tint = Color.Gray
                )
            }


        }

    }


}